package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.vF0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4347vF0 {
    void T(Bundle bundle);

    MediaFormat a();

    void b(int i8, int i9, int i10, long j8, int i11);

    void c(Surface surface);

    void d(int i8, long j8);

    boolean e(InterfaceC4238uF0 interfaceC4238uF0);

    void f();

    ByteBuffer g(int i8);

    void h();

    void i(int i8);

    void j(int i8, boolean z7);

    void k();

    void l(int i8, int i9, Lx0 lx0, long j8, int i10);

    int m(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer z(int i8);

    int zza();
}
