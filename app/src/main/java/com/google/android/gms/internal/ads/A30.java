package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class A30 implements InterfaceC2462dy0 {
    public static C3341m20 a(Context context, C3751pq c3751pq, C3860qq c3860qq, Object obj, R20 r20, C3343m30 c3343m30, Xx0 xx0, Xx0 xx02, Xx0 xx03, Xx0 xx04, Xx0 xx05, Xx0 xx06, Xx0 xx07, Executor executor, RunnableC3464n90 runnableC3464n90, HN hn) {
        HashSet hashSet = new HashSet();
        hashSet.add((C2582f30) obj);
        hashSet.add(r20);
        hashSet.add(c3343m30);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23692H5)).booleanValue()) {
            hashSet.add((InterfaceC3014j20) xx0.zzb());
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23700I5)).booleanValue()) {
            hashSet.add((InterfaceC3014j20) xx02.zzb());
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23716K5)).booleanValue()) {
            hashSet.add((InterfaceC3014j20) xx04.zzb());
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23724L5)).booleanValue()) {
            hashSet.add((InterfaceC3014j20) xx05.zzb());
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23869d3)).booleanValue()) {
            hashSet.add((InterfaceC3014j20) xx07.zzb());
        }
        return new C3341m20(context, executor, hashSet, runnableC3464n90, hn);
    }
}
