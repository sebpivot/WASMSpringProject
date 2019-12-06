package com.adaming.wasmspringproject.exception;

public class NullTournamentException extends Exception {
    public NullTournamentException() { System.out.println("No tournament!"); }
}
