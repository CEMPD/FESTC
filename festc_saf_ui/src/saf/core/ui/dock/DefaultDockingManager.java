package saf.core.ui.dock;
import java.awt.Color;
/**
  /**
    iconManager = dockingControl.intern().getController().getIcons();
    for (DefaultPerspective perspective : perspectives) {
  /**
  /**
  /**
    Perspective perspective = perspectiveMap.get(perspectiveID);
    boolean show = perspectiveID.equals(currentPerspective.getID());
    perspective.addDockableFrame(groupID, dockable, show);
    if (show) {
  /**
  /**
  /**
  /**
  /**
  /**
  private void activatePerspective(String perspectiveID) {
    pSelectionSupport.firePerpectiveChanging(currentPerspective, perspective);
  /**
  /**
  /**
  /**
  private void updateWindowsMenu() {
  /**
  private DefaultCDockable setDockableActions(DefaultCDockable dockable, int flags, MinimizeLocation loc) {
    // clear out the standard actions
   // add our custom normalize action
    if ((flags & CLOSE) > 0) {
  /**
  /**
  /**
  /**