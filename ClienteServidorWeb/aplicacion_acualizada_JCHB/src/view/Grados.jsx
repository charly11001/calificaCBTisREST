import React, { Component } from 'react';
import { Link } from "react-router-dom";
import { Container, Button } from "@material-ui/core";
import HomeIcon from '@material-ui/icons/Home';

class Grados extends Component {
    state = {  }
    render() { 
        return ( 
            <div className="App-grados">
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
            </div>
         );
    }
}
 
export default Grados;