package com.google.android.gms.common.api;

import X2.InterfaceC0756d;
import X2.InterfaceC0761i;
import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC1090b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f13247a = Collections.newSetFromMap(new WeakHashMap());

    public interface a extends InterfaceC0756d {
    }

    public interface b extends InterfaceC0761i {
    }

    public abstract AbstractC1090b a(AbstractC1090b abstractC1090b);

    public abstract Looper b();
}
