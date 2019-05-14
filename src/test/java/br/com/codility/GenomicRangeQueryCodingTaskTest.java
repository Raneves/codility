package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by rjesus on 10/05/19.
 */
public class GenomicRangeQueryCodingTaskTest {


    @Test
    public void shouldReturnsValue241WhenDNASequenceIsCAGCCTAWithP250ANdQ456() throws Exception {
        GenomicRangeQueryCodingTask genomicRangeQueryCodingTask = new GenomicRangeQueryCodingTask("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6});
        int[] minimalImpactFactor = genomicRangeQueryCodingTask.findTheMinimalImpactFactor();
        assertThat(minimalImpactFactor, is(equalTo(new int[]{2, 4, 1})));
    }

    @Test
    public void shouldReturnsValue1WhenDNASequenceIsAWithP0ANdQ0() throws Exception {
        GenomicRangeQueryCodingTask genomicRangeQueryCodingTask = new GenomicRangeQueryCodingTask("A", new int[]{0}, new int[]{0});
        int[] minimalImpactFactor = genomicRangeQueryCodingTask.findTheMinimalImpactFactor();
        assertThat(minimalImpactFactor, is(equalTo(new int[]{1})));
    }

    @Test
    public void shouldReturnsValue2WhenDNASequenceIsCWithP0ANdQ0() throws Exception {
        GenomicRangeQueryCodingTask genomicRangeQueryCodingTask = new GenomicRangeQueryCodingTask("C", new int[]{0}, new int[]{0});
        int[] minimalImpactFactor = genomicRangeQueryCodingTask.findTheMinimalImpactFactor();
        assertThat(minimalImpactFactor, is(equalTo(new int[]{2})));
    }

    @Test
    public void shouldReturnsValue3WhenDNASequenceIsGWithP0ANdQ0() throws Exception {
        GenomicRangeQueryCodingTask genomicRangeQueryCodingTask = new GenomicRangeQueryCodingTask("G", new int[]{0}, new int[]{0});
        int[] minimalImpactFactor = genomicRangeQueryCodingTask.findTheMinimalImpactFactor();
        assertThat(minimalImpactFactor, is(equalTo(new int[]{3})));
    }

    @Test
    public void shouldReturnsValue4WhenDNASequenceIsTWithP0ANdQ0() throws Exception {
        GenomicRangeQueryCodingTask genomicRangeQueryCodingTask = new GenomicRangeQueryCodingTask("T", new int[]{0}, new int[]{0});
        int[] minimalImpactFactor = genomicRangeQueryCodingTask.findTheMinimalImpactFactor();
        assertThat(minimalImpactFactor, is(equalTo(new int[]{4})));
    }

    @Test
    public void shouldReturnsValue1WhenDNASequenceIsAWithP0ANdQ1() throws Exception {
        GenomicRangeQueryCodingTask genomicRangeQueryCodingTask = new GenomicRangeQueryCodingTask("AT", new int[]{0}, new int[]{1});
        int[] minimalImpactFactor = genomicRangeQueryCodingTask.findTheMinimalImpactFactor();
        assertThat(minimalImpactFactor, is(equalTo(new int[]{1})));
    }

    @Test
    public void shouldReturnsValue112WhenDNASequenceIsACWithP001ANdQ011() throws Exception {
        GenomicRangeQueryCodingTask genomicRangeQueryCodingTask = new GenomicRangeQueryCodingTask("AC", new int[]{0, 0, 1}, new int[]{0, 1, 1});
        int[] minimalImpactFactor = genomicRangeQueryCodingTask.findTheMinimalImpactFactor();
        assertThat(minimalImpactFactor, is(equalTo(new int[]{1, 1, 2})));
    }

}