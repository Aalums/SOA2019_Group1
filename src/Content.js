import React, {Component} from 'react';
import './css/home.css';
import './css/menu.css';

class Content extends Component {
    render() {
        return (
            <div className="site-content">
                <div>
                    <img src="https://s3.amazonaws.com/artprofmedia/2018/09/26211621/Clar_NYTCooking_WIP2-1366x800.jpg"
                         className="display center-fit"/>
                </div>

                <div className="space-line">
                    <h4 className="white padding">Category</h4>
                </div>

                <div className="row">
                    <a className="column white" href="/type/menu">
                        <figure>
                            <img width="294" height="196"
                                 src="https://scm-assets.constant.co/scm/unilever/a6798e909fa57bfd19c3e7f00737e5d6/85e48a46-7e8f-46bc-a81f-aa82b75e40c5.jpg"/>
                        </figure>
                        <div className="space-line">
                            <div className="post_details align-center">
                                <h3>ต้ม</h3>
                            </div>
                        </div>
                    </a>
                    <a className="column white" href="/type/menu">
                        <figure>
                            <img width="294" height="196"
                                 src="https://scm-assets.constant.co/scm/unilever/e9dc924f238fa6cc29465942875fe8f0/67a3e09f-7b21-40be-9b7d-b56bcb236276.jpg"/>
                        </figure>
                        <div className="space-line">
                            <div className="post_details align-center">
                                <h3>ผัด</h3>
                            </div>
                        </div>
                    </a>
                    <a className="column white" href="/type/menu">
                        <figure>
                            <img width="294" height="196"
                                 src="https://scm-assets.constant.co/scm/unilever/a6798e909fa57bfd19c3e7f00737e5d6/bfc28dba-6840-4af6-8236-568e6704e43b.jpg"/>
                        </figure>
                        <div className="space-line">
                            <div className="post_details align-center">
                                <h3>แกง</h3>
                            </div>
                        </div>
                    </a>
                    <a className="column white" href="/type/menu">
                        <figure>
                            <img width="294" height="196"
                                 src="https://scm-assets.constant.co/scm/unilever/a6798e909fa57bfd19c3e7f00737e5d6/d40bb2d7-1a66-4dc0-b3ae-6763934eadb1.jpg"/>
                        </figure>
                        <div className="space-line">
                            <div className="post_details align-center">
                                <h3>ทอด</h3>
                            </div>
                        </div>
                    </a>
                </div>
            </div>
        );
    }
}

export default Content;