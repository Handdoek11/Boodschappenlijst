package p3;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.Intent;

/* loaded from: classes.dex */
public final class W extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private Activity f40213a;

    public W(Application application) {
        super(application);
    }

    public final void a(Activity activity) {
        this.f40213a = activity;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Activity activity = this.f40213a;
        return activity != null ? activity.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f40213a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            super.startActivity(intent);
        }
    }
}
