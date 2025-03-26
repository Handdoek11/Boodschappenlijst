package com.headcode.ourgroceries.android;

import android.content.Intent;
import android.widget.RemoteViewsService;

/* loaded from: classes2.dex */
public class OurAppWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new C5599m2((OurApplication) getApplication(), getApplicationContext(), intent);
    }
}
