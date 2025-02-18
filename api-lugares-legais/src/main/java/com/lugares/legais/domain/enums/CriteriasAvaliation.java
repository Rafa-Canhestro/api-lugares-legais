package com.lugares.legais.domain.enums;

public enum CriteriasAvaliation {

    AMAZING(100.0),
    ITS_GOOD(75.0),
    MUST_TO_BE_BETTER(50.0),
    IT_ALMOST_A_SHIT(30.0),
    AWFUL(0);

    private final double evaluation;

    CriteriasAvaliation(double evaluation) {
        this.evaluation = evaluation;
    }

    public Double getEvaluation() {
        return evaluation;
    }

}
