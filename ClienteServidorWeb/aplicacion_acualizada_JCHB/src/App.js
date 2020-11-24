import React from 'react';
import { BrowserRouter, Switch, Route } from "react-router-dom";

import Alumnos from './component/Alumnos';
import Content from './component/Content';
import Footer from './component/Footer';
import Docentes from './component/Docentes';
import Header from './component/Header';
import Carreras from './component/Carreras';
import Menu from './component/Menu';
import './styles/App.css';






function App() {
  return (
      <BrowserRouter>
        <Switch>
          <Route path="/" exact component={Menu} />
          <Route path="/alumnos" exact component={Alumnos} />
          <Route path="/carreras" exact component={Carreras} />
          <Route path="/docentes" exact component={Docentes} />         
          <Route path="/test" exact component={() => <h1>Principal</h1>} />
          <Route path="/mantenimiento" exact component={() => <h1>ESTAMOS EN MANTENIMIENTO</h1>} />
          <Route path="*" component={() => <h1>404 Not FOUND</h1>} />
        </Switch>
      </BrowserRouter>
  );
}

export default App;
