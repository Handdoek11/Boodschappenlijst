package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* renamed from: com.google.android.gms.internal.ads.qu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3868qu extends MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private Activity f25999a;

    /* renamed from: b, reason: collision with root package name */
    private Context f26000b;

    /* renamed from: c, reason: collision with root package name */
    private Context f26001c;

    public C3868qu(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Activity a() {
        return this.f25999a;
    }

    public final Context b() {
        return this.f26001c;
    }

    public final void c(Intent intent, int i8) {
        if (this.f25999a == null) {
            intent.setFlags(268435456);
            this.f26000b.startActivity(intent);
            return;
        }
        AbstractC0608p0.k("Starting activity for result with intent: " + String.valueOf(intent.getData()) + " and requestCode: 236");
        this.f25999a.startActivityForResult(intent, 236);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f26001c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f26000b = applicationContext;
        this.f25999a = context instanceof Activity ? (Activity) context : null;
        this.f26001c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f25999a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f26000b.startActivity(intent);
        }
    }
}
