package com.dasheck.materialminesweeper.fragments.settings.interactors;

import com.dasheck.model.models.BackgroundMusic;
import rx.Observable;

/**
 * @author Stefan Neidig
 */
public interface GetSelectedBackgroundMusicInteractor {

  Observable<BackgroundMusic> execute();
}
