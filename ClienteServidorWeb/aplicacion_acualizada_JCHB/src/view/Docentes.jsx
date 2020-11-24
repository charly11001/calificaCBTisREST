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

  

class Docentes extends Component {
    constructor(props) {
        super(props);   
        this.state = {
            edit: false,
            idDocente: 0,
            docentes1: []
        }
    }
        state = {

       }
  
    titulo = "LISTA DE PROFESORES";


  frmNombre = React.createRef();
  frmEspecialidad = React.createRef();

  addDocente = event => {
    event.preventDefault();
    
   const data = { nombre:this.frmNombre.value, especialidad:this.frmEspecialidad.value}

    if(!this.state.edit) {
        const url ='http://localhost:4000/api/docentes';
       
       axios.post(url, data)
            .then(res => console.log(res.data));
       
        
        this.frmNombre.value="";
        this.frmEspecialidad.value="";
       

        console.log(url);
  
    }
    else {

        const url ='http://localhost:4000/api/docentes/'+this.state.id;

        const data = { nombre:this.frmNombre.value, especialidad:this.frmEspecialidad.value}

        axios.put(url, data)
            .then(res => console.log(res.data));

        console.log(url);
        
    }

        this.loadDocente();
        

  }



  viewDocente = (row) => event => {
    event.preventDefault();

    this.frmNombre.value = "";
    this.frmEspecialidad.value = "";

 
    this.frmNombre.value = this.state.docentes1[row].nombre;
    this.frmEspecialidad.value = this.state.docentes1[row].especialidad;
    

  }


  editDocente = (id, row) => event => {
    event.preventDefault();

    var newState = this.state;
    newState.edit = true;
    newState.id = id;

    this.setState(newState);
  
    
    //this.frmNombre.focus();
    // this.frmNombre.value="";
    this.frmNombre.value = this.state.docentes1[row].nombre;
    this.frmEspecialidad.value = this.state.docentes1[row].especialidad;
    


  }

  deleteDocente = (id) => event => {
    event.preventDefault();

    const url ='http://localhost:4000/api/docentes/'+id;
   
    axios.delete(url)
        .then(res => console.log(res.data));

    this.loadDocente();

    console.log(url);
    
  }


    loadDocente() {

        axios.get('http://localhost:4000/api/docentes')
        .then(res => {

            this.setState({ docentes1: res.data});
            console.log(res.data);
           

        })


    }

        componentDidMount() {
            this.loadDocente();
            
        }


    render() { 
        return ( 
            <div className="App-docentes">
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
                <form autoComplete="off" onSubmit={this.addDocente}>    
                   
                          
                   
                   
                    <TextField
                        label="Nombre"
                        type="text"
                        margin="normal"
                        variant="outlined"
                        inputRef={e => (this.frmNombre = e)}
                    />
                    &nbsp; &nbsp; 
                        <TextField
                        label="Especialidad"
                        type="text"
                        margin="normal"
                        variant="outlined"
                        inputRef={e => (this.frmEspecialidad = e)}
                    />






                    <Fab
                    color="primary"
                    size="medium"
                    //className="dish-form-icon"
                    onClick={this.addDocente}
                    >
                    <AddIcon />
                    </Fab>
                </form>

                <List
                    component="nav"
                    subheader={<ListSubheader component="div">{ this.titulo }</ListSubheader>}
                    >
                    {this.state.docentes1.map((docente, index) => (
                        <ListItem button key={index}>
                            <ListItemIcon onClick={this.viewDocente(index)}>
                                <PersonIcon />
                            </ListItemIcon>

                            
                            <ListItemText inset primary={docente.nombre} />
                            <ListItemText inset primary={docente.especialidad} />

                            <ListItemIcon onClick={this.editDocente(docente.id, index)}>
                                <EditIcon />
                            </ListItemIcon>
                            <ListItemIcon onClick={this.deleteDocente(docente.id)}>
                                <DeleteIcon />
                            </ListItemIcon>
                        </ListItem>
                    ))}
                </List>
            </div>
         );
    }
}
 
export default Docentes;