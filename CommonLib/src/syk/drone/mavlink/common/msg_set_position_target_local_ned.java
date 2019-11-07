/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SET_POSITION_TARGET_LOCAL_NED PACKING
package syk.drone.mavlink.common;
import syk.drone.mavlink.MAVLinkPacket;
import syk.drone.mavlink.Messages.MAVLinkMessage;
import syk.drone.mavlink.Messages.MAVLinkPayload;

/**
* Sets a desired vehicle position in a local north-east-down coordinate frame. Used by an external controller to command the vehicle (manual controller or other system).
*/
public class msg_set_position_target_local_ned extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SET_POSITION_TARGET_LOCAL_NED = 84;
    public static final int MAVLINK_MSG_LENGTH = 53;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SET_POSITION_TARGET_LOCAL_NED;


      
    /**
    * Timestamp (time since system boot).
    */
    public long time_boot_ms;
      
    /**
    * X Position in NED frame
    */
    public float x;
      
    /**
    * Y Position in NED frame
    */
    public float y;
      
    /**
    * Z Position in NED frame (note, altitude is negative in NED)
    */
    public float z;
      
    /**
    * X velocity in NED frame
    */
    public float vx;
      
    /**
    * Y velocity in NED frame
    */
    public float vy;
      
    /**
    * Z velocity in NED frame
    */
    public float vz;
      
    /**
    * X acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N
    */
    public float afx;
      
    /**
    * Y acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N
    */
    public float afy;
      
    /**
    * Z acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N
    */
    public float afz;
      
    /**
    * yaw setpoint
    */
    public float yaw;
      
    /**
    * yaw rate setpoint
    */
    public float yaw_rate;
      
    /**
    * Bitmap to indicate which dimensions should be ignored by the vehicle.
    */
    public int type_mask;
      
    /**
    * System ID
    */
    public short target_system;
      
    /**
    * Component ID
    */
    public short target_component;
      
    /**
    * Valid options are: MAV_FRAME_LOCAL_NED = 1, MAV_FRAME_LOCAL_OFFSET_NED = 7, MAV_FRAME_BODY_NED = 8, MAV_FRAME_BODY_OFFSET_NED = 9
    */
    public short coordinate_frame;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_SET_POSITION_TARGET_LOCAL_NED;
              
        packet.payload.putUnsignedInt(time_boot_ms);
              
        packet.payload.putFloat(x);
              
        packet.payload.putFloat(y);
              
        packet.payload.putFloat(z);
              
        packet.payload.putFloat(vx);
              
        packet.payload.putFloat(vy);
              
        packet.payload.putFloat(vz);
              
        packet.payload.putFloat(afx);
              
        packet.payload.putFloat(afy);
              
        packet.payload.putFloat(afz);
              
        packet.payload.putFloat(yaw);
              
        packet.payload.putFloat(yaw_rate);
              
        packet.payload.putUnsignedShort(type_mask);
              
        packet.payload.putUnsignedByte(target_system);
              
        packet.payload.putUnsignedByte(target_component);
              
        packet.payload.putUnsignedByte(coordinate_frame);
        
        return packet;
    }

    /**
    * Decode a set_position_target_local_ned message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.time_boot_ms = payload.getUnsignedInt();
              
        this.x = payload.getFloat();
              
        this.y = payload.getFloat();
              
        this.z = payload.getFloat();
              
        this.vx = payload.getFloat();
              
        this.vy = payload.getFloat();
              
        this.vz = payload.getFloat();
              
        this.afx = payload.getFloat();
              
        this.afy = payload.getFloat();
              
        this.afz = payload.getFloat();
              
        this.yaw = payload.getFloat();
              
        this.yaw_rate = payload.getFloat();
              
        this.type_mask = payload.getUnsignedShort();
              
        this.target_system = payload.getUnsignedByte();
              
        this.target_component = payload.getUnsignedByte();
              
        this.coordinate_frame = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_set_position_target_local_ned(){
        msgid = MAVLINK_MSG_ID_SET_POSITION_TARGET_LOCAL_NED;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_set_position_target_local_ned(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_SET_POSITION_TARGET_LOCAL_NED;
        unpack(mavLinkPacket.payload);        
    }

                                    
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_SET_POSITION_TARGET_LOCAL_NED - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" x:"+x+" y:"+y+" z:"+z+" vx:"+vx+" vy:"+vy+" vz:"+vz+" afx:"+afx+" afy:"+afy+" afz:"+afz+" yaw:"+yaw+" yaw_rate:"+yaw_rate+" type_mask:"+type_mask+" target_system:"+target_system+" target_component:"+target_component+" coordinate_frame:"+coordinate_frame+"";
    }
}
        