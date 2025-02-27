/*
 * PausedTasksListMessage.java Jul 10, 2012 1.0
 */
package edu.cmu.gizmo.management.taskbus.messages;


/**
 * The Class PausedTasksListMessage.
 */
public class PausedTasksListMessage implements TaskMessage {

	/** The task id. */
	private Integer taskId;
	
	/** The capability id. */
	private Integer capabilityId;
	
	/**
	 * Instantiates a new paused tasks list message.
	 *
	 * @param tid the tid
	 * @param cid the cid
	 */
	public PausedTasksListMessage(Integer tid, Integer cid)  {
		taskId = tid;
		capabilityId = cid;
	}
	
	/**
	 * Gets the task id.
	 *
	 * @return the task id
	 */
	public Integer getTaskId() {
		return taskId;
	}

	/**
	 * Gets the capability id.
	 *
	 * @return the capability id
	 */
	public Integer getCapabilityId() {
		return capabilityId;
	}

	/**
	 * Sets the capability id.
	 *
	 * @param cid the new capability id
	 */
	public void setCapabilityId(Integer cid) {
		capabilityId = cid;
	}

	/* (non-Javadoc)
	 * @see edu.cmu.gizmo.management.taskbus.messages.TaskMessage#getMessageType()
	 */
	@Override
	public String getMessageType() {
		return TaskMessage.PAUSE_LIST; 
	}
}
