import React from 'react';
import PT_Event from './PT_Event';

const PT_EventList = React.createClass({
  getDefaultProps: function() {
    return {
      events: [],
    }
  },

  getInitialState: function() {
    return  {
      class: "eventList"
    }
  },

  render: function() {
    return (
      <div className={this.state.class}>
        {
          this.props.events.map(function(event, i){
            return(
              <PT_Event
                key={i}
                nom_evt={event.nom_evt}
                lieu_evt={event.lieu_evt}
                orga_evt={event.orga_evt}
                date_evt={event.date_evt}
                heure_evt={event.heure_evt}
                desc_evt={event.desc_evt}
                nb_insc_evt={event.nb_insc_evt}
                nb_places_evt={event.nb_places_evt}
                image_evt={event.image_evt}
              />
            );
          })
        }
      </div>
    );
  }
});

export default PT_EventList;
