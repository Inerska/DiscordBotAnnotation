package fr.leonarddoo.dba.factory;

import fr.leonarddoo.dba.annotation.Option;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

public final class OptionDataFactory {
    public OptionData createFrom(final Option option) {
        return new OptionData(
                option.type(),
                option.name(),
                option.description(),
                option.required()
        );
    }
}
