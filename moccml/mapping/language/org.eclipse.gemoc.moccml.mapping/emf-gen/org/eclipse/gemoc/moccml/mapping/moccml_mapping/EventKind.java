/**
 * Copyright (c) 2010, 2017 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 */
package org.eclipse.gemoc.moccml.mapping.moccml_mapping;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Event Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.moccml.mapping.moccml_mapping.MoCCMLmappingPackage#getEventKind()
 * @model
 * @generated
 */
public enum EventKind implements Enumerator {
	/**
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(0, "undefined", "undefined"),

	/**
	 * The '<em><b>Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_VALUE
	 * @generated
	 * @ordered
	 */
	START(1, "start", "start"),

	/**
	 * The '<em><b>Finish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISH_VALUE
	 * @generated
	 * @ordered
	 */
	FINISH(2, "finish", "finish"),

	/**
	 * The '<em><b>Send</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEND_VALUE
	 * @generated
	 * @ordered
	 */
	SEND(3, "send", "send"),

	/**
	 * The '<em><b>Receive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVE_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVE(4, "receive", "receive"),

	/**
	 * The '<em><b>Consume</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSUME_VALUE
	 * @generated
	 * @ordered
	 */
	CONSUME(6, "consume", "consume"),

	/**
	 * The '<em><b>Produce</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCE_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCE(5, "produce", "produce"),

	/**
	 * The '<em><b>Create</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE(7, "create", "create"),

	/**
	 * The '<em><b>Destroy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTROY_VALUE
	 * @generated
	 * @ordered
	 */
	DESTROY(8, "destroy", "destroy"),

	/**
	 * The '<em><b>Suspend</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPEND_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPEND(9, "suspend", "suspend"),

	/**
	 * The '<em><b>Resume</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESUME_VALUE
	 * @generated
	 * @ordered
	 */
	RESUME(10, "resume", "resume"),

	/**
	 * The '<em><b>Call</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALL_VALUE
	 * @generated
	 * @ordered
	 */
	CALL(11, "call", "call");

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undefined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model name="undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START
	 * @model name="start"
	 * @generated
	 * @ordered
	 */
	public static final int START_VALUE = 1;

	/**
	 * The '<em><b>Finish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Finish</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINISH
	 * @model name="finish"
	 * @generated
	 * @ordered
	 */
	public static final int FINISH_VALUE = 2;

	/**
	 * The '<em><b>Send</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Send</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEND
	 * @model name="send"
	 * @generated
	 * @ordered
	 */
	public static final int SEND_VALUE = 3;

	/**
	 * The '<em><b>Receive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Receive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECEIVE
	 * @model name="receive"
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVE_VALUE = 4;

	/**
	 * The '<em><b>Consume</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Consume</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSUME
	 * @model name="consume"
	 * @generated
	 * @ordered
	 */
	public static final int CONSUME_VALUE = 6;

	/**
	 * The '<em><b>Produce</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Produce</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRODUCE
	 * @model name="produce"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCE_VALUE = 5;

	/**
	 * The '<em><b>Create</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Create</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE
	 * @model name="create"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_VALUE = 7;

	/**
	 * The '<em><b>Destroy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Destroy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESTROY
	 * @model name="destroy"
	 * @generated
	 * @ordered
	 */
	public static final int DESTROY_VALUE = 8;

	/**
	 * The '<em><b>Suspend</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Suspend</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUSPEND
	 * @model name="suspend"
	 * @generated
	 * @ordered
	 */
	public static final int SUSPEND_VALUE = 9;

	/**
	 * The '<em><b>Resume</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resume</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESUME
	 * @model name="resume"
	 * @generated
	 * @ordered
	 */
	public static final int RESUME_VALUE = 10;

	/**
	 * The '<em><b>Call</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Call</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CALL
	 * @model name="call"
	 * @generated
	 * @ordered
	 */
	public static final int CALL_VALUE = 11;

	/**
	 * An array of all the '<em><b>Event Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EventKind[] VALUES_ARRAY = new EventKind[] { UNDEFINED, START, FINISH, SEND, RECEIVE, CONSUME,
			PRODUCE, CREATE, DESTROY, SUSPEND, RESUME, CALL, };

	/**
	 * A public read-only list of all the '<em><b>Event Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EventKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Event Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventKind get(int value) {
		switch (value) {
		case UNDEFINED_VALUE:
			return UNDEFINED;
		case START_VALUE:
			return START;
		case FINISH_VALUE:
			return FINISH;
		case SEND_VALUE:
			return SEND;
		case RECEIVE_VALUE:
			return RECEIVE;
		case CONSUME_VALUE:
			return CONSUME;
		case PRODUCE_VALUE:
			return PRODUCE;
		case CREATE_VALUE:
			return CREATE;
		case DESTROY_VALUE:
			return DESTROY;
		case SUSPEND_VALUE:
			return SUSPEND;
		case RESUME_VALUE:
			return RESUME;
		case CALL_VALUE:
			return CALL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EventKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //EventKind
