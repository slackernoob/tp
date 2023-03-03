package seedu.vms.logic.parser;

import static seedu.vms.logic.parser.CliSyntax.PREFIX_REMARK;
import static java.util.Objects.requireNonNull;
import static seedu.vms.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;


import seedu.vms.commons.core.index.Index;
import seedu.vms.commons.exceptions.IllegalValueException;
import seedu.vms.logic.commands.RemarkCommand;
import seedu.vms.logic.parser.exceptions.ParseException;
import seedu.vms.model.person.Remark;

public class RemarkCommandParser implements Parser<RemarkCommand>{
    public RemarkCommand parse(String args) throws ParseException {
        requireNonNull(args);
        ArgumentMultimap argMultimap = ArgumentTokenizer.tokenize(args, PREFIX_REMARK);
    
        Index index;
        try {
            index = ParserUtil.parseIndex(argMultimap.getPreamble());
        } catch (IllegalValueException ive) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                RemarkCommand.MESSAGE_USAGE), ive);
        }
    
        String remark = argMultimap.getValue(PREFIX_REMARK).orElse("");
        Remark remarkRemark = new Remark(remark);
        return new RemarkCommand(index, remarkRemark);
    }
}
