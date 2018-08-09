package com.vamshi.ds;

import com.vamshi.ds.l1.OctalToDecimalTest;
import com.vamshi.ds.ll.LinkedListTest;
import com.vamshi.ds.queue.QueueTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({OctalToDecimalTest.class, LinkedListTest.class, QueueTest.class})

public class AllTests {

}
