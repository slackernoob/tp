package seedu.vms.storage.vaccination;

import static seedu.vms.model.vaccination.VaxTestingUtil.assertVaxType;

import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Test;

import seedu.vms.model.vaccination.VaxRequirement;
import seedu.vms.model.vaccination.VaxType;


public class VaxTypeLoaderTest {
    private static final String TYPE_1_NAME = "Dose 1 (Pfizer)";
    private static final HashSet<String> TYPE_1_GROUPS = new HashSet<>(List.of("DOSE 1", "Pfizer", "Vaccination"));
    private static final int TYPE_1_MIN_AGE = 5;
    private static final int TYPE_1_MAX_AGE = Integer.MAX_VALUE;
    private static final int TYPE_1_MIN_SPACING = 56;
    private static final List<VaxRequirement> TYPE_1_REQUIREMENTS = List.of(
            new VaxRequirement(true, new HashSet<>(List.of("DOSE 1"))));
    private static final List<VaxRequirement> TYPE_1_ALLERGY_REQS = List.of(
            new VaxRequirement(true, new HashSet<>(List.of(
                    "((4-Hydroxybutyl)azanediyl)bis(hexane-6,1-diyl)bis(2-hexyldecanoate)",
                    "2-[(polyethylene glycol)-2000]-N,N-ditetradecylacetamide",
                    "1,2-Distearoyl-sn-glycero-3-phosphocholine",
                    "Cholesterol",
                    "Sucrose",
                    "Phosphate",
                    "Tromethamine",
                    "Tris(hydroxymethyl)aminoethane hydrochloride"))));


    @Test
    public void loadTest() throws Exception {
        VaxTypeLoader.load();
        assertVaxType(VaxType.get(TYPE_1_NAME),
                TYPE_1_NAME,
                TYPE_1_GROUPS,
                TYPE_1_MIN_AGE,
                TYPE_1_MAX_AGE,
                TYPE_1_MIN_SPACING,
                TYPE_1_REQUIREMENTS,
                TYPE_1_ALLERGY_REQS);
    }
}
