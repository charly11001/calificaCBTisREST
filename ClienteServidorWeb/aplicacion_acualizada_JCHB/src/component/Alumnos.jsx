import React, { Component } from 'react';
import { Link } from "react-router-dom";
import { Container, Button } from "@material-ui/core";
import HomeIcon from '@material-ui/icons/Home';

import Header from './Header';
import AlumnosView from '../view/Alumnos';
import Footer from './Footer';



class Alumnos extends Component {
    state = {  }

    alumnosArray = ["CARRANZA CAMPOS FERNANDO", 
    "CHAVEZ GUERRERO YADIRA", 
    "GARCIA FERNANDEZ RAMON", 
    "HERNANDEZ BARRERA JUAN CARLOS",
    "MORENO GATICA OSCAR DANIEL",
    "NAREZ RUÍZ LUIS FERNANDO",
    "SAMANO RAMIREZ ANA KARENT",
    "SUAREZ ZINZUN CHRISTIAN EMMANUEL",
    "VENTURA ROMERO CHRISTIAN",
    "VILLANUEVA MASCORT ERICK DALET"];
    
    render() { 
        return ( 
            <div>
            <Header name="ALUMNOS" />
                <AlumnosView data={ this.alumnosArray }/>
                <Footer />
            </div>
         );
    }
}
 
export default Alumnos;