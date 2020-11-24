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

  

class Alumnos extends Component {
    constructor(props) {
        super(props);   
        this.state = {
            edit: false,
            idAlumno: 0,
            alumnos1: []
        }
    }
        state = {

       }
  
    titulo = "LISTA DE ALUMNOS";


  frmNoControl = React.createRef();
  frmNombre = React.createRef();
  frmGrupo = React.createRef();
  frmTurno = React.createRef();





  addAlumno = event => {
    event.preventDefault();
    
   const data = { noControl:this.frmNoControl.value, nombre:this.frmNombre.value,  grupo:this.frmGrupo.value,  turno:this.frmTurno.value}

    if(!this.state.edit) {
        const url ='http://localhost:4000/api/alumnos';
       
       axios.post(url, data)
            .then(res => console.log(res.data));
       
        this.frmNoControl.value="";
        this.frmNombre.value="";
        this.frmGrupo.value="";
        this.frmTurno.value="";


        this.frmNoControl.focus();

        console.log(url);
  
    }
    else {

        const url ='http://localhost:4000/api/alumnos/'+this.state.id;

        const data = { noControl:this.frmNoControl.value, nombre:this.frmNombre.value,  grupo:this.frmGrupo.value,  turno:this.frmTurno.value}

        axios.put(url, data)
            .then(res => console.log(res.data));

        console.log(url);
        
    }

        this.loadAlumno();
        

  }



  viewAlumno = (row) => event => {
    event.preventDefault();

    this.frmNoControl.value = "";
    this.frmNombre.value = "";
    this.frmGrupo.value = "";
    this.frmTurno.value = "";

    this.frmNoControl.focus();

    this.frmNoControl.value = this.state.alumnos1[row].noControl;
    this.frmNombre.value = this.state.alumnos1[row].nombre;
    this.frmGrupo.value = this.state.alumnos1[row].grupo;
    this.frmTurno.value = this.state.alumnos1[row].turno;
    //this.frmNombre.value = this.state.alumnos[id];

  }


  editAlumno = (id, row) => event => {
    event.preventDefault();

    var newState = this.state;
    newState.edit = true;
    newState.id = id;

    this.setState(newState);
  
    this.frmNoControl.focus();
    this.frmNoControl.value = this.state.alumnos1[row].noControl;
    
    //this.frmNombre.focus();
    // this.frmNombre.value="";
    this.frmNombre.value = this.state.alumnos1[row].nombre;
    this.frmGrupo.value = this.state.alumnos1[row].grupo;
    this.frmTurno.value = this.state.alumnos1[row].turno;


  }

  deleteAlumno = (id) => event => {
    event.preventDefault();

    const url ='http://localhost:4000/api/alumnos/'+id;
   
    axios.delete(url)
        .then(res => console.log(res.data));

    this.loadAlumno();

    console.log(url);
    
  }


    loadAlumno() {

        axios.get('http://localhost:4000/api/alumnos')
        .then(res => {

            this.setState({ alumnos1: res.data});
            console.log(res.data);
           

        })


    }

        componentDidMount() {
            this.loadAlumno();
            
        }


    render() { 
        return ( 
            <div className="App-alumnos">
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
                <form autoComplete="off" onSubmit={this.addAlumno}>    
                   
                   <TextField
                        label="No. de control"
                        type="text"
                        margin="normal"
                        variant="outlined"
                        inputRef={e => (this.frmNoControl = e)}
                    />
                   
                   &nbsp; &nbsp;          
                   
                   
                    <TextField
                        label="Nombre"
                        type="text"
                        margin="normal"
                        variant="outlined"
                        inputRef={e => (this.frmNombre = e)}
                    />
                    &nbsp; &nbsp; 
                    <TextField
                        label="Grupo"
                        type="text"
                        margin="normal"
                        variant="outlined"
                        inputRef={e => (this.frmGrupo = e)}
                    />
                      &nbsp; &nbsp; 
                    <TextField
                        label="Turno"
                        type="text"
                        margin="normal"
                        variant="outlined"
                        inputRef={e => (this.frmTurno = e)}
                    />


                    <Fab
                    color="primary"
                    size="medium"
                    //className="dish-form-icon"
                    onClick={this.addAlumno}
                    >
                    <AddIcon />
                    </Fab>
                </form>

                <List
                    component="nav"
                    subheader={<ListSubheader component="div">{ this.titulo }</ListSubheader>}
                    >
                    {this.state.alumnos1.map((alumno, index) => (
                        <ListItem button key={index}>
                            <ListItemIcon onClick={this.viewAlumno(index)}>
                                <PersonIcon />
                            </ListItemIcon>

                            <ListItemText inset primary={alumno.noControl} />
                            <ListItemText inset primary={alumno.nombre} />
                            <ListItemText inset primary={alumno.grupo} />
                            <ListItemText inset primary={alumno.turno} />
                            <ListItemIcon onClick={this.editAlumno(alumno.id, index)}>
                                <EditIcon />
                            </ListItemIcon>
                            <ListItemIcon onClick={this.deleteAlumno(alumno.id)}>
                                <DeleteIcon />
                            </ListItemIcon>
                        </ListItem>
                    ))}
                </List>
            </div>
         );
    }
}
 
export default Alumnos;