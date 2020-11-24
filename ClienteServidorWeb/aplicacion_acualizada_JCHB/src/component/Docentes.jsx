import React from 'react'
import { Link } from "react-router-dom";
import { Container, Button } from "@material-ui/core";
import HomeIcon from '@material-ui/icons/Home';

import Header from './Header';
import DocentesView from '../view/Docentes';
import Footer from './Footer';

class Docentes extends React.Component {
    state = {  }
    render() { 
        return ( 
            <div>
            <Header name="DOCENTES" />
                <DocentesView />
                <Footer />
            </div>
         );
    }
}
 
export default Docentes;