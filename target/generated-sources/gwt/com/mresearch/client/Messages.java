package com.mresearch.client;

/**
 * Interface to represent the messages contained in resource bundle:
 * 	/Users/user/databank/databankmaven/databank/src/main/resources/com/mresearch/client/Messages.properties'.
 */
public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated "Current locale:".
   * 
   * @return translated "Current locale:"
   */
  @DefaultMessage("Current locale:")
  @Key("localeMsg")
  String localeMsg();

  /**
   * Translated "Enter your name".
   * 
   * @return translated "Enter your name"
   */
  @DefaultMessage("Enter your name")
  @Key("nameField")
  String nameField();

  /**
   * Translated "GWT UKMA project".
   * 
   * @return translated "GWT UKMA project"
   */
  @DefaultMessage("GWT UKMA project")
  @Key("projectHeading")
  String projectHeading();

  /**
   * Translated "Send".
   * 
   * @return translated "Send"
   */
  @DefaultMessage("Send")
  @Key("sendButton")
  String sendButton();
}
