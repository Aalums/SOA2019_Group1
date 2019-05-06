import React, {Component} from 'react';
import axios from 'axios'
import '../css/detail.css';

class DetailContent extends Component{

    state = {
        menu: [],
        ingredient: [],
        direction: []
    }

    componentDidMount() {
        axios.get('https://jsonplaceholder.typicode.com/users/' + 1)
        // axios.get('http://localhost:8083//menu/{menuId}/menudetail')
            .then(res => {
                console.log(res);
                this.setState({
                    menu: res.data,
                    ingredient: res.data.address,
                    direction: res.data.company
                });

            })
            .catch(error => {
                console.log(error);
            });
    }

    render() {
        return (
            <div className="site-content">
                <div className="wrapper-detail">
                    <div className="cell-row white">
                        <div className="topic cell">
                            <h3>Tun Yum Kung | {this.state.menu.id}</h3>
                        </div>
                        <div className="topic cell">
                            <img width="-webkit-fill-available"
                                 src="http://www.thaifoodheritage.com/uploads/recipe_list/gallery/e3de5-jpg.jpeg"/>
                        </div>
                    </div>

                    <br></br>

                    <div className="white padding">
                        <div className="detail detail-row">
                            <div className="detail-col detail-info">
                                <h6>time to cook</h6>
                                <h3>15 mins</h3>
                            </div>
                            <div className="detail-col detail-info">
                                <h6>level</h6>
                                <h3>Easy</h3>
                            </div>
                            <div className="detail-col detail-info">
                                <h6>dishes</h6>
                                <h3>for 1-2 people</h3>
                            </div>
                        </div>
                    </div>

                    <br></br>

                    <div className="white padding align-center">
                        <h3>Ingredients</h3>
                        <h6>{this.state.ingredient.street}</h6>
                    </div>

                    <br></br>

                    <div className="white padding align-center">
                        <h3>Directions</h3>
                    </div>
                </div>
            </div>
        );
    }
}

export default DetailContent;