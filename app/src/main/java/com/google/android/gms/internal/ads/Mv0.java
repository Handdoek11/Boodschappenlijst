package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class Mv0 extends AbstractC2314ce0 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f17429e;

    /* renamed from: f, reason: collision with root package name */
    private final DatagramPacket f17430f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f17431g;

    /* renamed from: h, reason: collision with root package name */
    private DatagramSocket f17432h;

    /* renamed from: i, reason: collision with root package name */
    private MulticastSocket f17433i;

    /* renamed from: j, reason: collision with root package name */
    private InetAddress f17434j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17435k;

    /* renamed from: l, reason: collision with root package name */
    private int f17436l;

    public Mv0(int i8) {
        super(true);
        byte[] bArr = new byte[2000];
        this.f17429e = bArr;
        this.f17430f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3684pA0
    public final int C(byte[] bArr, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        if (this.f17436l == 0) {
            try {
                DatagramSocket datagramSocket = this.f17432h;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(this.f17430f);
                int length = this.f17430f.getLength();
                this.f17436l = length;
                z(length);
            } catch (SocketTimeoutException e8) {
                throw new zzgz(e8, 2002);
            } catch (IOException e9) {
                throw new zzgz(e9, 2001);
            }
        }
        int length2 = this.f17430f.getLength();
        int i10 = this.f17436l;
        int min = Math.min(i10, i9);
        System.arraycopy(this.f17429e, length2 - i10, bArr, i8, min);
        this.f17436l -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final Uri a() {
        return this.f17431g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void d() {
        InetAddress inetAddress;
        this.f17431g = null;
        MulticastSocket multicastSocket = this.f17433i;
        if (multicastSocket != null) {
            try {
                inetAddress = this.f17434j;
            } catch (IOException unused) {
            }
            if (inetAddress == null) {
                throw null;
            }
            multicastSocket.leaveGroup(inetAddress);
            this.f17433i = null;
        }
        DatagramSocket datagramSocket = this.f17432h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f17432h = null;
        }
        this.f17434j = null;
        this.f17436l = 0;
        if (this.f17435k) {
            this.f17435k = false;
            g();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final long e(C4393vk0 c4393vk0) {
        Uri uri = c4393vk0.f27331a;
        this.f17431g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f17431g.getPort();
        i(c4393vk0);
        try {
            this.f17434j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f17434j, port);
            if (this.f17434j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f17433i = multicastSocket;
                multicastSocket.joinGroup(this.f17434j);
                this.f17432h = this.f17433i;
            } else {
                this.f17432h = new DatagramSocket(inetSocketAddress);
            }
            this.f17432h.setSoTimeout(8000);
            this.f17435k = true;
            j(c4393vk0);
            return -1L;
        } catch (IOException e8) {
            throw new zzgz(e8, 2001);
        } catch (SecurityException e9) {
            throw new zzgz(e9, 2006);
        }
    }
}
