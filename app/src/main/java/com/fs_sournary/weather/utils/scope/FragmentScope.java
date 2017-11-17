package com.fs_sournary.weather.utils.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description: scope for component in every fragment.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface FragmentScope {
}
