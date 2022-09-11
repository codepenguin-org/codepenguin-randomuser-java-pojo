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
 * Result with a random user data.
 *
 * @param gender     the gender.
 * @param name       the name.
 * @param location   the location.
 * @param email      the email.
 * @param login      the login.
 * @param dob        the date of birth.
 * @param registered the registered time.
 * @param phone      the phone number.
 * @param cell       the cellphone number.
 * @param id         the id.
 * @param picture    the pictures.
 * @param nat        the nationality.
 * @author Jorge Garcia
 * @version 1.0.0
 * @since 17
 */
public record Result(String gender, Name name, Location location, String email, Login login, Dob dob,
                     Registered registered, String phone, String cell, Id id, Picture picture,
                     String nat) implements Serializable {

    @Serial
    private static final long serialVersionUID = -804926840124786148L;
}
