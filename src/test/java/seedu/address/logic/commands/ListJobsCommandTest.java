//package seedu.address.logic.commands;
//
//import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;
//
//import org.junit.Before;
//
//import seedu.address.logic.CommandHistory;
//import seedu.address.logic.UndoRedoStack;
//import seedu.address.model.Model;
//import seedu.address.model.ModelManager;
//import seedu.address.model.UserPrefs;
//
///**
// * Contains integration tests (interaction with the Model) and unit tests for ListJobsCommand.
// */
//public class ListJobsCommandTest {
//    private Model model;
//    private Model expectedModel;
//    private ListJobsCommand listJobsCommand;
//
//    @Before
//    public void setUp() {
//        model = new ModelManager(getTypicalAddressBook(), new UserPrefs());
//        expectedModel = new ModelManager(model.getAddressBook(), new UserPrefs());
//
//        listJobsCommand = new ListJobsCommand();
//        listJobsCommand.setData(model, new CommandHistory(), new UndoRedoStack());
//    }
//
////    @Test
////    public void execute_jobListIsNotFiltered_showsSameList() {
////        assertCommandSuccess(listJobsCommand, model, ListJobsCommand.MESSAGE_SUCCESS, expectedModel);
////    }
////
////    @Test
////    public void execute_jobListIsFiltered_showsEverything() {
////        showJobAtIndex(model, INDEX_FIRST_JOB);
////        assertCommandSuccess(listJobsCommand, model, ListJobsCommand.MESSAGE_SUCCESS, expectedModel);
////    }
//}
