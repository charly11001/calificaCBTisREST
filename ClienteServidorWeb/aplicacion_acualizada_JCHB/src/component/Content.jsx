import React, { Component } from 'react';
import { Link } from "react-router-dom";
import { makeStyles } from '@material-ui/core/styles';
import { Container, Button } from "@material-ui/core";


class Content extends Component {
    state = {  }
    render() { 
        return ( 
            <div className="App-content">
                <Container maxWidth="xs">
                <Link to="/alumnos">
                    <Button variant="contained" color="default">
                        Alumnos
                    </Button>
                </Link>
                &nbsp;&nbsp;
                <Link to="/carreras">
                    <Button variant="contained" color="default">
                        Carreras
                    </Button>
                </Link>
                &nbsp;&nbsp;
                <Link to="/docentes">
                    <Button variant="contained" color="default">
                        Docentes
                    </Button>
                </Link>
            </Container>
            </div>
         );
    }
}
 
export default Content;