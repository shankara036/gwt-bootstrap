/*
 *  Copyright 2012 GWT-Bootstrap
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.github.gwtbootstrap.showcase.client.basewidget;

import com.github.gwtbootstrap.showcase.client.framework.HasMenuPlace;
import com.github.gwtbootstrap.showcase.client.framework.Menus;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class BasePlace extends HasMenuPlace {

    public BasePlace(String token) {
        super(Menus.BASE);
        setToken(token);
    }
    
    @Prefix("base")
    public static class Tokenizer extends HasMenuPlace.Tokenizer<BasePlace> implements PlaceTokenizer<BasePlace> {

        @Override
        public BasePlace getPlace(String token) {
            return new BasePlace(token);
        }
    }


}
