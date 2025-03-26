package Z2;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
final class D extends G {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Intent f6246o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Activity f6247s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ int f6248t;

    D(Intent intent, Activity activity, int i8) {
        this.f6246o = intent;
        this.f6247s = activity;
        this.f6248t = i8;
    }

    @Override // Z2.G
    public final void a() {
        Intent intent = this.f6246o;
        if (intent != null) {
            this.f6247s.startActivityForResult(intent, this.f6248t);
        }
    }
}
