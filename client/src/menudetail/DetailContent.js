import React, {Component} from 'react';
import axios from 'axios'
import '../css/detail.css';

class DetailContent extends Component{

    state = {
        menus: []
    }

    componentDidMount() {
        axios.get('https://jsonplaceholder.typicode.com/users')
        // axios.get('http://localhost:8083/category/{type}/menu')
            .then(res => {
                console.log(res);
                this.setState({menus: res.data});
                if(menus.id == 1){

                }
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
                            <h3>Tom Yum Kung</h3>
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