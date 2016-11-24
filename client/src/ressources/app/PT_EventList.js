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
              console.log("eventDate: " + event.dateEvt);
              console.log("heureEvt: " + event.heureEvt);
            return(
              <PT_Event
                key={i}
                nom_evt={event.nomEvt}
                lieu_evt={event.lieuEvt}
                orga_evt={event.orgaEvt}
                date_evt={event.dateEvt}
                heure_evt={event.heureEvt}
                desc_evt={event.descEvt}
                nb_insc_evt={event.nbInscEvt}
                nb_places_evt={event.nbPlacesEvt}
                image_evt={event.imageEvt}
              />
            );
          })
        }
      </div>
    );
  }
});

export default PT_EventList;
