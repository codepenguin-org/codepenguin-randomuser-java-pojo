/*
 * codepenguin-randomuser-java-pojo
 * Copyright (C) 2022 codepenguin.org - Jorge Garcia
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.codepenguin.pojo.randomuser;

import java.io.Serial;
import java.io.Serializable;

/**
 * Geographic location.
 *
 * @param street      the street.
 * @param city        the city's name.
 * @param state       the state's name.
 * @param country     the country's name.
 * @param postcode    the postcode.
 * @param coordinates the coordinates.
 * @param timezone    the timezone.
 * @author Jorge Garcia
 * @version 1.0.0
 * @since 17
 */
public record Location(Street street, String city, String state, String country, String postcode,
                       Coordinates coordinates, Timezone timezone) implements Serializable {

    @Serial
    private static final long serialVersionUID = 3690708828267645336L;
}
