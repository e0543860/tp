package seedu.address.ui;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

/**
 * An UI component that displays the Tab Pane.
 */
public class TabMenu extends UiPart<Region> {

    private static final String FXML = "TabMenu.fxml";

    @FXML
    private TabPane tabMenu;

    @FXML
    private Tab tab1;

    @FXML
    private Label tab1Name = new Label("Contacts");

    @FXML
    private Tab tab2;

    @FXML
    private Label tab2Name = new Label("Tasks");

    @FXML
    private GridPane contactsContainerBox;

    @FXML
    private VBox leftBox;

    @FXML
    private VBox rightBox;

    private int currentTabNumber = 0;

    /**
     * Creates a {@code PersonCode} with the given {@code Person} and index to display.
     */
    public TabMenu() {
        super(FXML);
    }

    /**
     * Returns the {@code containerBox} object.
     *
     * @return the containerBox object.
     */
    public GridPane getGridPane() {
        return contactsContainerBox;
    }

    /**
     * Switches the current tab.
     *
     * @param i the index of the selected tab.
     */
    public void switchTab(int i) {
        this.tabMenu.getSelectionModel().select(i);
        currentTabNumber = i;
    }

    public TabPane getTabMenu() {
        return tabMenu;
    }

    public int getCurrentTabNumber() {
        return currentTabNumber;
    }


    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof TabPane)) {
            return false;
        }

        return false;
    }
}
