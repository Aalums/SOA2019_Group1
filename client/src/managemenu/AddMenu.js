import React, {Component} from 'react';
import HeaderMember from '../HeaderMember';
import ManageMenuApp from './AddMenuApp';

class AddMenu extends Component {

    render() {
        return (
            <div>
                <HeaderMember/>

                <ManageMenuApp/>

                </div>
        );
    }
}

export default AddMenu;