import React from 'react'
import { Link } from "react-router-dom";
import { Container, Button } from "@material-ui/core";
import HomeIcon from '@material-ui/icons/Home';

import Header from './Header';
import CarrerasView from '../view/Carreras';
import Footer from './Footer';

class Carreras extends React.Component {
    state = {  }
    render() { 
        return ( 
            <div>
            <Header name="CARRERAS" />
                <CarrerasView />
                <Footer />
            </div>
         );
    }
}
 
export default Carreras;