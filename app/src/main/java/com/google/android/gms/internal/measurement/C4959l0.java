package com.google.android.gms.internal.measurement;

import java.io.File;

/* renamed from: com.google.android.gms.internal.measurement.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4959l0 implements InterfaceC4967m0 {
    C4959l0() {
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4967m0
    public final String a(String str, AbstractC4999q0 abstractC4999q0, EnumC4975n0 enumC4975n0) {
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4967m0
    public final /* synthetic */ String b(File file, String str) {
        return d(file, str, AbstractC4999q0.f29508a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4967m0
    public final /* synthetic */ String c(String str, AbstractC4999q0 abstractC4999q0) {
        return a(str, abstractC4999q0, EnumC4975n0.RAW_FILE_IO_TYPE);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4967m0
    public final /* synthetic */ String d(File file, String str, AbstractC4999q0 abstractC4999q0) {
        return c(new File(file, str).getPath(), abstractC4999q0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4967m0
    public final /* synthetic */ String n(String str) {
        return c(str, AbstractC4999q0.f29508a);
    }
}
