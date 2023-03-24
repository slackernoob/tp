package seedu.vms.logic.commands.vaccination;

import java.util.Collection;
import java.util.function.Predicate;

import javafx.collections.ObservableMap;
import seedu.vms.commons.core.GuiSettings;
import seedu.vms.commons.exceptions.IllegalValueException;
import seedu.vms.logic.parser.ParseResult;
import seedu.vms.logic.parser.exceptions.ParseException;
import seedu.vms.model.FilteredMapView;
import seedu.vms.model.GroupName;
import seedu.vms.model.IdData;
import seedu.vms.model.Model;
import seedu.vms.model.ReadOnlyUserPrefs;
import seedu.vms.model.appointment.Appointment;
import seedu.vms.model.appointment.AppointmentManager;
import seedu.vms.model.keyword.Keyword;
import seedu.vms.model.keyword.KeywordManager;
import seedu.vms.model.patient.Patient;
import seedu.vms.model.patient.ReadOnlyPatientManager;
import seedu.vms.model.vaccination.VaxType;
import seedu.vms.model.vaccination.VaxTypeAction;
import seedu.vms.model.vaccination.VaxTypeManager;


/**
 * Stub {@code Model} to test vaccination commands.
 */
public class VaxTypeModelStub implements Model {

    public final VaxTypeManager manager = new VaxTypeManager();
    public final FilteredMapView<String, VaxType> filteredMapView =
            new FilteredMapView<>(manager.asUnmodifiableObservableMap());

    @Override
    public void setUserPrefs(ReadOnlyUserPrefs userPrefs) {
        throw new UnsupportedOperationException("Unimplemented method 'setUserPrefs'");
    }

    @Override
    public ReadOnlyUserPrefs getUserPrefs() {
        throw new UnsupportedOperationException("Unimplemented method 'getUserPrefs'");
    }

    @Override
    public GuiSettings getGuiSettings() {
        throw new UnsupportedOperationException("Unimplemented method 'getGuiSettings'");
    }

    @Override
    public void setGuiSettings(GuiSettings guiSettings) {
        throw new UnsupportedOperationException("Unimplemented method 'setGuiSettings'");
    }

    @Override
    public void setPatientManager(ReadOnlyPatientManager patientManager) {
        throw new UnsupportedOperationException("Unimplemented method 'setPatientManager'");
    }

    @Override
    public ReadOnlyPatientManager getPatientManager() {
        throw new UnsupportedOperationException("Unimplemented method 'getPatientManager'");
    }

    @Override
    public boolean hasPatient(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'hasPatient'");
    }

    @Override
    public void deletePatient(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'deletePatient'");
    }

    @Override
    public void deleteAppointment(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteAppointment'");
    }

    @Override
    public void markAppointment(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'markAppointment'");
    }

    @Override
    public void unmarkAppointment(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'unmarkAppointment'");
    }

    @Override
    public void addPatient(Patient patient) {
        throw new UnsupportedOperationException("Unimplemented method 'addPatient'");
    }

    @Override
    public void setPatient(int id, Patient editedPatient) {
        throw new UnsupportedOperationException("Unimplemented method 'setPatient'");
    }

    @Override
    public void setAppointment(int id, Appointment editedAppointment) {
        throw new UnsupportedOperationException("Unimplemented method 'setAppointment'");
    }

    @Override
    public ObservableMap<Integer, IdData<Patient>> getFilteredPatientList() {
        throw new UnsupportedOperationException("Unimplemented method 'getFilteredPatientList'");
    }

    @Override
    public ObservableMap<String, VaxType> getFilteredVaxTypeMap() {
        return filteredMapView.asUnmodifiableObservableMap();
    }

    @Override
    public void updateFilteredPatientList(Predicate<Patient> predicate) {
        throw new UnsupportedOperationException("Unimplemented method 'updateFilteredPatientList'");
    }

    @Override
    public void updateFilteredAppointmentList(Predicate<Appointment> predicate) {
        throw new UnsupportedOperationException("Unimplemented method 'updateFilteredAppointmentList'");
    }

    @Override
    public VaxTypeManager getVaxTypeManager() {
        throw new UnsupportedOperationException("Unimplemented method 'getVaxTypeManager'");
    }

    @Override
    public VaxType performVaxTypeAction(VaxTypeAction action) throws IllegalValueException {
        return action.apply(manager);
    }

    @Override
    public void addAppointment(Appointment appointment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAppointment'");
    }

    @Override
    public ObservableMap<Integer, IdData<Appointment>> getFilteredAppointmentMap() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFilteredAppointmentMap'");
    }

    @Override
    public AppointmentManager getAppointmentManager() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAppointmentManager'");
    }

    @Override
    public VaxType deleteVaxType(GroupName vaxName) throws IllegalValueException {
        return manager.remove(vaxName.toString())
                .orElseThrow(() -> new IllegalValueException(String.format(
                        "Vaccination type does not exist: %s", vaxName.toString())));
    }

    @Override
    public ObservableMap<Integer, IdData<Keyword>> getFilteredKeywordList() {
        throw new UnsupportedOperationException("Unimplemented method 'getFilteredKeywordList'");
    }

    @Override
    public void addKeyword(Keyword keyword) {
        throw new UnsupportedOperationException("Unimplemented method 'addKeyword'");
    }

    @Override
    public void deleteKeyword(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteKeyword'");
    }

    @Override
    public void updateFilteredKeywordList(Predicate<Keyword> predicate) {
        throw new UnsupportedOperationException("Unimplemented method 'updateFilteredKeywordList'");
    }

    @Override
    public KeywordManager getKeywordManager() {
        throw new UnsupportedOperationException("Unimplemented method 'getKeywordManager'");
    }

    @Override
    public ParseResult parseCommand(String userCommand) throws ParseException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'parseCommand'");
    }

    @Override
    public void setVaxTypeManager(VaxTypeManager manager) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVaxTypeManager'");
    }

    @Override
    public void setAppointmentManager(AppointmentManager manager) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAppointmentManager'");
    }

    @Override
    public void setKeywordManager(KeywordManager manager) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setKeywordManager'");
    }

    @Override
    public void setVaccinationFilters(Collection<Predicate<VaxType>> filters) {
        filteredMapView.setFilters(filters);
    }

}
