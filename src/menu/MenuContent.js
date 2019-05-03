import React, {Component} from 'react';
import 'font-awesome/css/font-awesome.min.css';
import '../css/menu.css';

class MenuContent extends Component {
    render() {
        return (
            <div className="site-content">
                <div className="wrapper-menu">
                    <div className="row">
                        <a className="column white" href="/menu/detail">
                            <h2>Tum Yum Kung</h2>
                            <div className="cat_star">
                                <a className="cat_name" title=""><h7>ต้ม</h7></a>
                                <div className="reviews_short">
                                    <span title="5.00 Yıldız" className="stars_given">
                                        {/*<span style="width: 100%"></span>*/}
                                    </span>
                                </div>
                            </div>
                            <figure className="space-line">
                                <img width="294" height="196"
                                     src="http://www.thaifoodheritage.com/uploads/recipe_list/gallery/e3de5-jpg.jpeg"/>
                            </figure>
                            <div className="other_details space-line">
                                <div className="view">
                                    <i className="fa fa-eye"></i> 13.2B
                                </div>
                                <div className="likes">
                                    <i className="fa fa-heart"></i> 120
                                </div>
                                <div className="user">
                                    <h7>Author name</h7>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
        );
    }
}

export default MenuContent;