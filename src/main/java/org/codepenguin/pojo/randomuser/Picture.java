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
 * Profile's pictures for the random user.
 *
 * @param large     the large picture's URL.
 * @param medium    the medium picture's URL.
 * @param thumbnail the thumbnail picture's URL.
 * @author Jorge Garcia
 * @version 1.0.0
 * @since 17
 */
public record Picture(String large, String medium, String thumbnail) implements Serializable {

    @Serial
    private static final long serialVersionUID = 7826143776235032074L;
}
