import React, { Component } from 'react';
import axios from 'axios';
import { Link } from "react-router-dom";
import HomeIcon from '@material-ui/icons/Home';
import { Fab, TextField } from "@material-ui/core";
import AddIcon from "@material-ui/icons/Add";
import EditIcon from '@material-ui/icons/Edit';
import DeleteIcon from '@material-ui/icons/Delete';
import PersonIcon from '@material-ui/icons/Person';

import {
    Button,
    Container,
    List,
    ListItem,
    ListSubheader,
    ListItemText,
    ListItemIcon
  } from "@material-ui/core";

  

class Carreras extends Component {
    constructor(props) {
        super(props);   
        this.state = {
            edit: false,
            idCarrera: 0,
            carreras1: []
        }
    }
        state = {

       }
  
    titulo = "LISTA DE CARRERAS";


  frmNombre = React.createRef();

  addCarrera = event => {
    event.preventDefault();
    
   const data = { nombre:this.frmNombre.value}

    if(!this.state.edit) {
        const url ='http://localhost:4000/api/carreras';
       
       axios.post(url, data)
            .then(res => console.log(res.data));
       
        
        this.frmNombre.value="";
       

        console.log(url);
  
    }
    else {

        const url ='http://localhost:4000/api/carreras/'+this.state.id;

        const data = { nombre:this.frmNombre.value }

        axios.put(url, data)
            .then(res => console.log(res.data));

        console.log(url);
        
    }

        this.loadCarrera();
        

  }



  viewCarrera = (row) => event => {
    event.preventDefault();

    this.frmNombre.value = "";
    

 
    this.frmNombre.value = this.state.carreras1[row].nombre;
    //this.frmNombre.value = this.state.alumnos[id];

  }


  editCarrera = (id, row) => event => {
    event.preventDefault();

    var newState = this.state;
    newState.edit = true;
    newState.id = id;

    this.setState(newState);
  
    
    //this.frmNombre.focus();
    // this.frmNombre.value="";
    this.frmNombre.value = this.state.carreras1[row].nombre;
    


  }

  deleteCarrera = (id) => event => {
    event.preventDefault();

    const url ='http://localhost:4000/api/carreras/'+id;
   
    axios.delete(url)
        .then(res => console.log(res.data));

    this.loadCarrera();

    console.log(url);
    
  }


    loadCarrera() {

        axios.get('http://localhost:4000/api/carreras')
        .then(res => {

            this.setState({ carreras1: res.data});
            console.log(res.data);
           

        })


    }

        componentDidMount() {
            this.loadCarrera();
            
        }


    render() { 
        return ( 
            <div className="App-carreras">
            <Container maxWidth="xs">
                <Link to="/">
                    <Button
                        variant="contained"
                        color="default"
                        size="small"
                        startIcon={<HomeIcon />}
                    >
                    Regresar
                    </Button>
                </Link>

            </Container>
                <form autoComplete="off" onSubmit={this.addCarrera}>    
                   
                          
                   
                   
                    <TextField
                        label="Nombre"
                        type="text"
                        margin="normal"
                        variant="outlined"
                        inputRef={e => (this.frmNombre = e)}
                    />
                    <Fab
                    color="primary"
                    size="medium"
                    //className="dish-form-icon"
                    onClick={this.addCarrera}
                    >
                    <AddIcon />
                    </Fab>
                </form>

                <List
                    component="nav"
                    subheader={<ListSubheader component="div">{ this.titulo }</ListSubheader>}
                    >
                    {this.state.carreras1.map((carrera, index) => (
                        <ListItem button key={index}>
                            <ListItemIcon onClick={this.viewCarrera(index)}>
                                <PersonIcon />
                            </ListItemIcon>

                            
                            <ListItemText inset primary={carrera.nombre} />

                            <ListItemIcon onClick={this.editCarrera(carrera.id, index)}>
                                <EditIcon />
                            </ListItemIcon>
                            <ListItemIcon onClick={this.deleteCarrera(carrera.id)}>
                                <DeleteIcon />
                            </ListItemIcon>
                        </ListItem>
                    ))}
                </List>
            </div>
         );
    }
}
 
export default Carreras;