import React from 'react'
import { Link } from "react-router-dom";
import { Container, Button } from "@material-ui/core";
// import HomeIcon from '@material-ui/icons/Home';
import ArrowBackIcon from '@material-ui/icons/ArrowBack';

import Header from './Header';
import GradosView from '../view/Grados';
import Footer from './Footer';

class Grados extends React.Component {
    state = {  }
    render() { 
        return ( 
            <div>
            <Header name="GRADOS" />
                <GradosView />
                <Footer />
            </div>
         );
    }
}
 
export default Grados;