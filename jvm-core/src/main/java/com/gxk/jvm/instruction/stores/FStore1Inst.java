package com.gxk.jvm.instruction.stores;

import com.gxk.jvm.instruction.Instruction;


import com.gxk.jvm.rtda.Frame;

public class FStore1Inst implements Instruction {

  @Override
  public void execute(Frame frame) {
    float tmp = frame.popFloat();
    frame.setFloat(1, tmp);
  }
}
