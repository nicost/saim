/*
 ///////////////////////////////////////////////////////////////////////////////
 //FILE:          
 //PROJECT:       SAIM
 //-----------------------------------------------------------------------------
 //
 // AUTHOR:       Nico Stuurman
 //
 // COPYRIGHT:    University of California, San Francisco 2015
 //
 // LICENSE:      This file is distributed under the BSD license.
 //               License text is included with the source distribution.
 //
 //               This file is distributed in the hope that it will be useful,
 //               but WITHOUT ANY WARRANTY; without even the implied warranty
 //               of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 //
 //               IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 //               CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 //               INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES.
 */
package edu.ucsf.valelab.saim;

/**
 *
 * @author nico
 */
public class Version {
   // This only works when run from the maven-build jar (i.e. not under Netbeans) 
   public final static String CURRENT_VERSION = 
           Version.class.getPackage().getImplementationVersion();
}
