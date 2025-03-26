package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.Ks, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1499Ks extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    final SSLSocketFactory f16679a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1533Ls f16680b;

    C1499Ks(C1533Ls c1533Ls) {
        this.f16680b = c1533Ls;
    }

    private final Socket a(Socket socket) {
        C1533Ls c1533Ls = this.f16680b;
        if (c1533Ls.f16926s > 0) {
            socket.setReceiveBufferSize(c1533Ls.f16926s);
        }
        this.f16680b.f16927t.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i8) {
        Socket createSocket = this.f16679a.createSocket(str, i8);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f16679a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f16679a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i8, InetAddress inetAddress, int i9) {
        Socket createSocket = this.f16679a.createSocket(str, i8, inetAddress, i9);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i8) {
        Socket createSocket = this.f16679a.createSocket(inetAddress, i8);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i8, InetAddress inetAddress2, int i9) {
        Socket createSocket = this.f16679a.createSocket(inetAddress, i8, inetAddress2, i9);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i8, boolean z7) {
        Socket createSocket = this.f16679a.createSocket(socket, str, i8, z7);
        a(createSocket);
        return createSocket;
    }
}
