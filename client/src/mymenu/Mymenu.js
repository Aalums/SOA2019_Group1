import React, {Component} from 'react';
import HeaderMember from '../HeaderMember';
import MymenuApp from './MymenuApp';

class Mymenu extends Component {
    render() {
        return (
            <div>
                <HeaderMember/>

                <MymenuApp/>

            </div>
        );
    }
}

export default Mymenu;