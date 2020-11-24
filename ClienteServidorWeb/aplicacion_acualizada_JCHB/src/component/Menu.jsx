import React, { Component } from 'react';
import { Link } from "react-router-dom";
import '../styles/App.css';

// Importar Componentes
import Header from './Header';
import Content from './Content';
import Footer from './Footer';


var alumnos = ["CARRANZA CAMPOS FERNANDO", 
"CHAVEZ GUERRERO YADIRA", 
"GARCIA FERNANDEZ RAMON", 
"HERNANDEZ BARRERA JUAN CARLOS",
"MORENO GATICA OSCAR DANIEL",
"NAREZ RUÍZ LUIS FERNANDO",
"SAMANO RAMIREZ ANA KARENT",
"SUAREZ ZINZUN CHRISTIAN EMMANUEL",
"VENTURA ROMERO CHRISTIAN",
"VILLANUEVA MASCORT ERICK DALET"];


class Menu extends Component {

    constructor(props) {
        super(props);   
        this.state = {
            alumnos: alumnos
        }
    }
    state = {
        
    }
    

    render() { 
        return ( 
            <div>
                <Header name="Ya! C++ Cursos" />
                <Content data={ this.state.data } />
                <Footer />
            </div>
         );
    }
}
 
export default Menu;