import React, {Component} from 'react';
import {browserHistory} from "react-router";
import '../css/manage.css'

class Manage extends Component {

    constructor() {
        super();

        // set initial state
        this.state = {
            id: "",
            title: "",
            ingredients: [],
            directions: []
        }

        this.addDirection = this.addDirection.bind(this);
    }

    //IngredientList
    addIngredient() {
        this.setState({ingredients: [...this.state.ingredients, ""]})
    }

    ingreChange(e, index){
        this.state.ingredients[index] = e.target.value

        //set change state
        this.setState({ingredients: this.state.ingredients})
    }

    ingreRemove(index){
        this.state.ingredients.splice(index, 1)
        console.log(this.state.ingredients, "$$$")

        //update the state
        this.setState({ingredients: this.state.ingredients})
    }

    //DirectionList
    addDirection() {
        this.setState({directions: [...this.state.directions, ""]})
    }

    directChange(e, index){
        this.state.directions[index] = e.target.value

        //set change state
        this.setState({directions: this.state.directions})
    }

    directRemove(index){
        this.state.directions.splice(index, 1)
        console.log(this.state.directions, "$$$")

        //update the state
        this.setState({directions: this.state.directions})
    }

    handleSubmit(e){

        //send to http request

        browserHistory.push("/member/menu")
    }

    render() {
        return(
            <div className="site-content">
                <br></br>
                <div className="wrapper-manage manage-text white">
                    <label>Menu Name</label>
                    <br></br>
                    <input type="text" name="title" placeholder="title"/>

                    <hr></hr>
                    <br></br>

                    <label>Time to Cook</label>
                    <br></br>
                    <input type="text" name="time" placeholder="15 mins"/>
                    <br></br>
                    <label>Level</label>
                    <br></br>
                    <select id="level" className="level">
                        <option value="easy">Easy</option>
                        <option value="medium">Medium</option>
                        <option value="hard">Hard</option>
                    </select>
                    <br></br>
                    <label>Dishes</label>
                    <br></br>
                    <input type="text" name="dishes" placeholder="2-3"/>

                    <hr></hr>
                    <br></br>

                    <label>Ingredients</label>
                    {this.state.ingredients.map((ingredient, index) =>{
                        return (
                            <div key={index}>
                                <input onChange={(e)=>this.ingreChange(e, index)} value={ingredient} type="text" placeholder={index+1}/>
                                <button onClick={()=>this.ingreRemove(index)}>Remove</button>
                            </div>
                        )
                    })}

                    <hr></hr>
                    <br></br>

                    <button onClick={(e) => this.addIngredient(e)}>Add ingredient</button>
                    <br></br>
                    <br></br>

                    <label>Directions :</label>
                    {this.state.directions.map((direction, index) =>{
                        return (
                            <div key={index}>
                                <input onChange={(e)=>this.directChange(e, index)} value={direction} type="text" placeholder={index+1}/>
                                <button onClick={()=>this.directRemove(index)}>Remove</button>
                            </div>
                        )
                    })}

                    <hr></hr>
                    <br></br>

                    <button onClick={(e) => this.addDirection(e)}>Add Direction</button>
                    <br></br>
                    <br></br>

                    <div id="save-btn" onClick={(e) => this.handleSubmit(e)}><i className="fa fa-save fa-2x"></i></div>

                </div>
            </div>
        );
    }
}

export default Manage;