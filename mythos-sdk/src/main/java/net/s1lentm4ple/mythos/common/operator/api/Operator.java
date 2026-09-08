package net.s1lentm4ple.mythos.common.operator.api;

import net.s1lentm4ple.mythos.common.operator.entity.*;

public interface Operator {
    public int execute(OpConfig config, OpInput input, OpOutput output);
}