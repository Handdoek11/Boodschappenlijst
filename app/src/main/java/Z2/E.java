package Z2;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
final class E extends G {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Intent f6249o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Fragment f6250s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ int f6251t;

    E(Intent intent, Fragment fragment, int i8) {
        this.f6249o = intent;
        this.f6250s = fragment;
        this.f6251t = i8;
    }

    @Override // Z2.G
    public final void a() {
        Intent intent = this.f6249o;
        if (intent != null) {
            this.f6250s.startActivityForResult(intent, this.f6251t);
        }
    }
}
