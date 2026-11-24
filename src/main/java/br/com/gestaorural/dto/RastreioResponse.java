package br.com.gestaorural.dto;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import br.com.gestaorural.model.*;
import br.com.gestaorural.model.enums.*;

public record RastreioResponse(Lote lote, List<EventoRastreio> eventos, List<Lote> origem, List<Cliente> destinos) {}
